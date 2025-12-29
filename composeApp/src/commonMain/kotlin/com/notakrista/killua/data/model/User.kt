package com.notakrista.killua.data.model

data class User(
    val id: String = "",
    val email: String = "",
    val firstName: String = "",
    val lastName: String = "",
    val userName: String = "",
    val profilePictureURL: String = "",
    val phoneNumber: String = "",
    val isActive: Boolean = false,
    val isOnboardingCompleted: Boolean = false,
    val isFirstTimeVisit: Boolean = true
) {
    val displayName: String
        get() = if (firstName.isNotBlank() && lastName.isNotBlank()) {
            "$firstName $lastName"
        } else if (firstName.isNotBlank()) {
            firstName
        } else if (userName.isNotBlank()) {
            userName
        } else {
            email
        }
}
