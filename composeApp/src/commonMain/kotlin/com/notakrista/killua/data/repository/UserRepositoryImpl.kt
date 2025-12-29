package com.notakrista.killua.data.repository

import com.notakrista.killua.data.model.User
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class UserRepositoryImpl : UserRepository {
    
    private val _currentUser = MutableStateFlow<User?>(null)
    
    // Simulated user database - in real app, this would be encrypted local storage
    private val users = mutableMapOf<String, UserAndPassword>()
    
    // Persistent storage simulation - in real app, use SharedPreferences or DataStore
    private var hasCompletedFirstVisit = false
    
    // Mockup user for demo purposes
    private val mockUser = User(
        id = "demo-user-123",
        email = "demo@killua.app",
        firstName = "Demo",
        lastName = "User",
        userName = "demo_user",
        isActive = true,
        isOnboardingCompleted = false,
        isFirstTimeVisit = false
    )
    
    override suspend fun loginUser(email: String, password: String): Result<User> {
        return try {
            // Simulate network delay
            kotlinx.coroutines.delay(1000)
            
            // Mockup logic: accept any email/password for demo
            val user = mockUser.copy(
                email = email.ifBlank { "guest@killua.app" },
                firstName = if (email.contains("@")) email.split("@").first() else "Guest",
                userName = if (email.contains("@")) email.split("@").first() else "guest"
            )
            
            _currentUser.value = user
            Result.success(user)
        } catch (e: Exception) {
            Result.failure(e)
        }
    }
    
    override suspend fun registerUser(email: String, password: String, firstName: String, lastName: String): Result<User> {
        return try {
            // Simulate network delay
            kotlinx.coroutines.delay(1000)
            
            // Mockup logic: create user without validation
            val newUser = mockUser.copy(
                email = email.ifBlank { "newuser@killua.app" },
                firstName = firstName.ifBlank { "New" },
                lastName = lastName.ifBlank { "User" },
                userName = "${firstName.ifBlank { "new" }}_${lastName.ifBlank { "user" }}".lowercase(),
                isOnboardingCompleted = false, // Fresh user needs post-registration onboarding
                isFirstTimeVisit = false
            )
            
            users[email.lowercase()] = UserAndPassword(newUser, password)
            _currentUser.value = newUser
            Result.success(newUser)
        } catch (e: Exception) {
            Result.failure(e)
        }
    }
    
    override suspend fun getCurrentUser(): User? {
        // If no current user and first visit hasn't been completed, create first-time visitor
        if (_currentUser.value == null && !hasCompletedFirstVisit) {
            return User(
                id = "first-time-visitor",
                email = "",
                firstName = "",
                lastName = "",
                userName = "",
                isActive = false,
                isOnboardingCompleted = false,
                isFirstTimeVisit = true
            )
        }
        return _currentUser.value
    }
    
    override suspend fun logoutUser() {
        _currentUser.value = null
    }
    
    override suspend fun updateOnboardingCompleted() {
        _currentUser.value?.let { user ->
            _currentUser.value = user.copy(isOnboardingCompleted = true)
        }
    }
    
    // New method to handle first visit completion
    suspend fun completeFirstVisit() {
        hasCompletedFirstVisit = true // Persist the first visit completion
        _currentUser.value?.let { user ->
            _currentUser.value = user.copy(isFirstTimeVisit = false)
        }
    }
    
    // Mockup method to simulate guest access
    suspend fun loginAsGuest(): Result<User> {
        return try {
            kotlinx.coroutines.delay(500) // Short delay for effect
            val guestUser = mockUser.copy(
                email = "guest@killua.app",
                firstName = "Guest",
                lastName = "User",
                userName = "guest",
                isOnboardingCompleted = false,
                isFirstTimeVisit = false
            )
            _currentUser.value = guestUser
            Result.success(guestUser)
        } catch (e: Exception) {
            Result.failure(e)
        }
    }
    
    override suspend fun isUserLoggedIn(): Boolean {
        return _currentUser.value != null
    }
    
    private data class UserAndPassword(
        val user: User,
        val password: String
    )
}
