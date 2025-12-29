package com.notakrista.killua.data.repository

import com.notakrista.killua.data.model.User

interface UserRepository {
    suspend fun loginUser(email: String, password: String): Result<User>
    suspend fun registerUser(email: String, password: String, firstName: String, lastName: String): Result<User>
    suspend fun getCurrentUser(): User?
    suspend fun logoutUser()
    suspend fun updateOnboardingCompleted()
    suspend fun isUserLoggedIn(): Boolean
}
