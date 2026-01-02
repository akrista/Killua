package com.notakrista.killua.presentation.preview

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun LoginScreenPreview() {
    MaterialTheme {
        Column(
                modifier =
                        Modifier.fillMaxSize()
                                .background(MaterialTheme.colorScheme.background)
                                .padding(24.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
        ) {
            Text(
                    "Welcome Back",
                    style =
                            TextStyle(
                                    fontSize = 32.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = MaterialTheme.colorScheme.onBackground
                            ),
                    modifier = Modifier.padding(bottom = 8.dp)
            )

            Text(
                    "Sign in to continue",
                    style =
                            TextStyle(
                                    fontSize = 16.sp,
                                    color =
                                            MaterialTheme.colorScheme.onBackground.copy(
                                                    alpha = 0.7f
                                            )
                            ),
                    modifier = Modifier.padding(bottom = 32.dp)
            )

            OutlinedTextField(
                    value = "",
                    onValueChange = {},
                    label = { Text("Email") },
                    modifier = Modifier.fillMaxWidth().padding(bottom = 16.dp),
                    shape = RoundedCornerShape(12.dp)
            )

            OutlinedTextField(
                    value = "",
                    onValueChange = {},
                    label = { Text("Password") },
                    modifier = Modifier.fillMaxWidth().padding(bottom = 24.dp),
                    shape = RoundedCornerShape(12.dp)
            )

            Button(
                    onClick = {},
                    modifier =
                            Modifier.fillMaxWidth().height(50.dp).clip(RoundedCornerShape(12.dp)),
                    colors =
                            ButtonDefaults.buttonColors(
                                    containerColor = MaterialTheme.colorScheme.primary
                            )
            ) {
                Text(
                        "Sign In",
                        style =
                                TextStyle(
                                        fontSize = 16.sp,
                                        fontWeight = FontWeight.Medium,
                                        color = MaterialTheme.colorScheme.onPrimary
                                )
                )
            }

            Spacer(modifier = Modifier.height(24.dp))

            Row(
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                        "Don't have an account? ",
                        style =
                                TextStyle(
                                        fontSize = 14.sp,
                                        color =
                                                MaterialTheme.colorScheme.onBackground.copy(
                                                        alpha = 0.7f
                                                )
                                )
                )
                TextButton(onClick = {}) {
                    Text(
                            "Sign Up",
                            style =
                                    TextStyle(
                                            fontSize = 14.sp,
                                            fontWeight = FontWeight.Medium,
                                            color = MaterialTheme.colorScheme.primary
                                    )
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun RegisterScreenPreview() {
    MaterialTheme {
        Column(
                modifier =
                        Modifier.fillMaxSize()
                                .background(MaterialTheme.colorScheme.background)
                                .padding(24.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
        ) {
            Text(
                    "Create Account",
                    style =
                            TextStyle(
                                    fontSize = 32.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = MaterialTheme.colorScheme.onBackground
                            ),
                    modifier = Modifier.padding(bottom = 8.dp)
            )

            Text(
                    "Sign up to get started",
                    style =
                            TextStyle(
                                    fontSize = 16.sp,
                                    color =
                                            MaterialTheme.colorScheme.onBackground.copy(
                                                    alpha = 0.7f
                                            )
                            ),
                    modifier = Modifier.padding(bottom = 32.dp)
            )

            Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                OutlinedTextField(
                        value = "John",
                        onValueChange = {},
                        label = { Text("First Name") },
                        modifier = Modifier.weight(1f).padding(bottom = 16.dp),
                        shape = RoundedCornerShape(12.dp)
                )

                OutlinedTextField(
                        value = "Doe",
                        onValueChange = {},
                        label = { Text("Last Name") },
                        modifier = Modifier.weight(1f).padding(bottom = 16.dp),
                        shape = RoundedCornerShape(12.dp)
                )
            }

            OutlinedTextField(
                    value = "john@example.com",
                    onValueChange = {},
                    label = { Text("Email") },
                    modifier = Modifier.fillMaxWidth().padding(bottom = 16.dp),
                    shape = RoundedCornerShape(12.dp)
            )

            OutlinedTextField(
                    value = "********",
                    onValueChange = {},
                    label = { Text("Password") },
                    modifier = Modifier.fillMaxWidth().padding(bottom = 16.dp),
                    shape = RoundedCornerShape(12.dp)
            )

            OutlinedTextField(
                    value = "********",
                    onValueChange = {},
                    label = { Text("Confirm Password") },
                    modifier = Modifier.fillMaxWidth().padding(bottom = 24.dp),
                    shape = RoundedCornerShape(12.dp)
            )

            Button(
                    onClick = {},
                    modifier =
                            Modifier.fillMaxWidth().height(50.dp).clip(RoundedCornerShape(12.dp)),
                    colors =
                            ButtonDefaults.buttonColors(
                                    containerColor = MaterialTheme.colorScheme.primary
                            )
            ) {
                Text(
                        "Sign Up",
                        style =
                                TextStyle(
                                        fontSize = 16.sp,
                                        fontWeight = FontWeight.Medium,
                                        color = MaterialTheme.colorScheme.onPrimary
                                )
                )
            }

            Spacer(modifier = Modifier.height(24.dp))

            Row(
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                        "Already have an account? ",
                        style =
                                TextStyle(
                                        fontSize = 14.sp,
                                        color =
                                                MaterialTheme.colorScheme.onBackground.copy(
                                                        alpha = 0.7f
                                                )
                                )
                )
                TextButton(onClick = {}) {
                    Text(
                            "Sign In",
                            style =
                                    TextStyle(
                                            fontSize = 14.sp,
                                            fontWeight = FontWeight.Medium,
                                            color = MaterialTheme.colorScheme.primary
                                    )
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun HomeScreenPreview() {
    MaterialTheme {
        Column(modifier = Modifier.fillMaxSize().background(MaterialTheme.colorScheme.background)) {
            // Top Bar Preview
            Surface(color = MaterialTheme.colorScheme.surface, modifier = Modifier.fillMaxWidth()) {
                Row(
                        modifier = Modifier.fillMaxWidth().padding(16.dp),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                            "Home",
                            style = TextStyle(fontSize = 20.sp, fontWeight = FontWeight.SemiBold)
                    )
                    Row {
                        Text("👤", fontSize = 20.sp)
                        Spacer(modifier = Modifier.width(16.dp))
                        Text("🚪", fontSize = 20.sp)
                    }
                }
            }

            Column(
                    modifier = Modifier.fillMaxSize().padding(24.dp),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.spacedBy(24.dp)
            ) {
                // Welcome Card Preview
                WelcomeCardPreview()

                // Feature Cards Preview
                FeatureCardsPreview()
            }
        }
    }
}

@Composable
private fun WelcomeCardPreview() {
    Card(
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(16.dp),
            colors =
                    CardDefaults.cardColors(
                            containerColor = MaterialTheme.colorScheme.primaryContainer
                    )
    ) {
        Column(
                modifier = Modifier.padding(24.dp),
                horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Box(
                    modifier =
                            Modifier.size(80.dp)
                                    .clip(CircleShape)
                                    .background(MaterialTheme.colorScheme.primary),
                    contentAlignment = Alignment.Center
            ) {
                Text(
                        text = "J",
                        style =
                                TextStyle(
                                        fontSize = 32.sp,
                                        fontWeight = FontWeight.Bold,
                                        color = MaterialTheme.colorScheme.onPrimary
                                )
                )
            }

            Spacer(modifier = Modifier.height(16.dp))

            Text(
                    text = "Welcome, John Doe!",
                    style =
                            TextStyle(
                                    fontSize = 24.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = MaterialTheme.colorScheme.onPrimaryContainer
                            ),
                    textAlign = TextAlign.Center
            )

            Spacer(modifier = Modifier.height(8.dp))

            Text(
                    text = "john@example.com",
                    style =
                            TextStyle(
                                    fontSize = 16.sp,
                                    color =
                                            MaterialTheme.colorScheme.onPrimaryContainer.copy(
                                                    alpha = 0.8f
                                            )
                            )
            )
        }
    }
}

@Composable
private fun FeatureCardsPreview() {
    Column(verticalArrangement = Arrangement.spacedBy(16.dp)) {
        Text(
                text = "Features",
                style =
                        TextStyle(
                                fontSize = 20.sp,
                                fontWeight = FontWeight.SemiBold,
                                color = MaterialTheme.colorScheme.onBackground
                        ),
                modifier = Modifier.align(Alignment.Start)
        )

        Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            FeatureCardPreview(
                    title = "Secure",
                    description = "Local authentication",
                    icon = "🔒",
                    modifier = Modifier.weight(1f)
            )
            FeatureCardPreview(
                    title = "Multiplatform",
                    description = "Works everywhere",
                    icon = "📱",
                    modifier = Modifier.weight(1f)
            )
        }

        Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            FeatureCardPreview(
                    title = "Modern",
                    description = "Compose UI",
                    icon = "🎨",
                    modifier = Modifier.weight(1f)
            )
            FeatureCardPreview(
                    title = "Fast",
                    description = "Kotlin native",
                    icon = "⚡",
                    modifier = Modifier.weight(1f)
            )
        }
    }
}

@Composable
private fun FeatureCardPreview(
        title: String,
        description: String,
        icon: String,
        modifier: Modifier = Modifier
) {
    Card(
            modifier = modifier,
            shape = RoundedCornerShape(12.dp),
            colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface)
    ) {
        Column(
                modifier = Modifier.padding(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = icon, style = TextStyle(fontSize = 32.sp))
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                    text = title,
                    style =
                            TextStyle(
                                    fontSize = 16.sp,
                                    fontWeight = FontWeight.Medium,
                                    color = MaterialTheme.colorScheme.onSurface
                            )
            )
            Text(
                    text = description,
                    style =
                            TextStyle(
                                    fontSize = 12.sp,
                                    color = MaterialTheme.colorScheme.onSurfaceVariant
                            ),
                    textAlign = TextAlign.Center
            )
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun FirstVisitOnboardingScreenPreview() {
    MaterialTheme {
        Column(modifier = Modifier.fillMaxSize().background(MaterialTheme.colorScheme.background)) {
            Spacer(modifier = Modifier.weight(0.1f))

            // Page Content
            Column(
                    modifier = Modifier.weight(1f).padding(24.dp),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
            ) {
                Text(text = "👋", fontSize = 120.sp, modifier = Modifier.padding(bottom = 32.dp))

                Text(
                        text = "Welcome to Killua",
                        fontSize = 28.sp,
                        fontWeight = FontWeight.Bold,
                        color = MaterialTheme.colorScheme.onBackground,
                        textAlign = TextAlign.Center,
                        modifier = Modifier.padding(bottom = 16.dp)
                )

                Text(
                        text = "Your modern multiplatform companion app",
                        fontSize = 16.sp,
                        color = MaterialTheme.colorScheme.onBackground.copy(alpha = 0.7f),
                        textAlign = TextAlign.Center,
                        lineHeight = 24.sp,
                        modifier = Modifier.padding(horizontal = 16.dp)
                )
            }

            // Bottom Navigation
            Column(
                    modifier = Modifier.fillMaxWidth().padding(horizontal = 24.dp, vertical = 16.dp)
            ) {
                // Page Indicator
                Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.Center,
                        verticalAlignment = Alignment.CenterVertically
                ) {
                    repeat(3) { index ->
                        Box(
                                modifier =
                                        Modifier.size(8.dp)
                                                .clip(RoundedCornerShape(4.dp))
                                                .background(
                                                        if (index == 0) {
                                                            MaterialTheme.colorScheme.primary
                                                        } else {
                                                            MaterialTheme.colorScheme.outline
                                                        }
                                                )
                        )
                        if (index < 2) {
                            Spacer(modifier = Modifier.width(8.dp))
                        }
                    }
                }

                Spacer(modifier = Modifier.height(24.dp))

                Button(
                        onClick = {},
                        modifier =
                                Modifier.fillMaxWidth()
                                        .height(50.dp)
                                        .clip(RoundedCornerShape(12.dp)),
                        colors =
                                ButtonDefaults.buttonColors(
                                        containerColor = MaterialTheme.colorScheme.primary
                                )
                ) {
                    Text(
                            "Next",
                            style =
                                    TextStyle(
                                            fontSize = 16.sp,
                                            fontWeight = FontWeight.Medium,
                                            color = MaterialTheme.colorScheme.onPrimary
                                    )
                    )
                }

                Spacer(modifier = Modifier.height(12.dp))

                TextButton(onClick = {}, modifier = Modifier.fillMaxWidth()) {
                    Text(
                            "Skip",
                            style =
                                    TextStyle(
                                            fontSize = 14.sp,
                                            color = MaterialTheme.colorScheme.primary
                                    )
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun OnboardingScreenPreview() {
    MaterialTheme {
        Column(modifier = Modifier.fillMaxSize().background(MaterialTheme.colorScheme.background)) {
            Spacer(modifier = Modifier.weight(0.1f))

            // Page Content
            Column(
                    modifier = Modifier.weight(1f).padding(24.dp),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
            ) {
                Text(text = "🔒", fontSize = 120.sp, modifier = Modifier.padding(bottom = 32.dp))

                Text(
                        text = "Secure Authentication",
                        fontSize = 28.sp,
                        fontWeight = FontWeight.Bold,
                        color = MaterialTheme.colorScheme.onBackground,
                        textAlign = TextAlign.Center,
                        modifier = Modifier.padding(bottom = 16.dp)
                )

                Text(
                        text = "Local authentication system to keep your data safe and private",
                        fontSize = 16.sp,
                        color = MaterialTheme.colorScheme.onBackground.copy(alpha = 0.7f),
                        textAlign = TextAlign.Center,
                        lineHeight = 24.sp,
                        modifier = Modifier.padding(horizontal = 16.dp)
                )
            }

            // Bottom Navigation
            Column(
                    modifier = Modifier.fillMaxWidth().padding(horizontal = 24.dp, vertical = 16.dp)
            ) {
                // Page Indicator
                Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.Center,
                        verticalAlignment = Alignment.CenterVertically
                ) {
                    repeat(3) { index ->
                        Box(
                                modifier =
                                        Modifier.size(8.dp)
                                                .clip(RoundedCornerShape(4.dp))
                                                .background(
                                                        if (index == 1) {
                                                            MaterialTheme.colorScheme.primary
                                                        } else {
                                                            MaterialTheme.colorScheme.outline
                                                        }
                                                )
                        )
                        if (index < 2) {
                            Spacer(modifier = Modifier.width(8.dp))
                        }
                    }
                }

                Spacer(modifier = Modifier.height(24.dp))

                Button(
                        onClick = {},
                        modifier =
                                Modifier.fillMaxWidth()
                                        .height(50.dp)
                                        .clip(RoundedCornerShape(12.dp)),
                        colors =
                                ButtonDefaults.buttonColors(
                                        containerColor = MaterialTheme.colorScheme.primary
                                )
                ) {
                    Text(
                            "Next",
                            style =
                                    TextStyle(
                                            fontSize = 16.sp,
                                            fontWeight = FontWeight.Medium,
                                            color = MaterialTheme.colorScheme.onPrimary
                                    )
                    )
                }

                Spacer(modifier = Modifier.height(12.dp))

                TextButton(onClick = {}, modifier = Modifier.fillMaxWidth()) {
                    Text(
                            "Skip",
                            style =
                                    TextStyle(
                                            fontSize = 14.sp,
                                            color = MaterialTheme.colorScheme.primary
                                    )
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun PostRegistrationOnboardingScreenPreview() {
    MaterialTheme {
        Column(modifier = Modifier.fillMaxSize().background(MaterialTheme.colorScheme.background)) {
            Spacer(modifier = Modifier.weight(0.1f))

            // Page Content
            Column(
                    modifier = Modifier.weight(1f).padding(24.dp),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
            ) {
                Text(text = "🎉", fontSize = 120.sp, modifier = Modifier.padding(bottom = 32.dp))

                Text(
                        text = "Welcome to Your Account",
                        fontSize = 28.sp,
                        fontWeight = FontWeight.Bold,
                        color = MaterialTheme.colorScheme.onBackground,
                        textAlign = TextAlign.Center,
                        modifier = Modifier.padding(bottom = 16.dp)
                )

                Text(
                        text = "Your personal space is ready to explore",
                        fontSize = 16.sp,
                        color = MaterialTheme.colorScheme.onBackground.copy(alpha = 0.7f),
                        textAlign = TextAlign.Center,
                        lineHeight = 24.sp,
                        modifier = Modifier.padding(horizontal = 16.dp)
                )
            }

            // Bottom Navigation
            Column(
                    modifier = Modifier.fillMaxWidth().padding(horizontal = 24.dp, vertical = 16.dp)
            ) {
                // Page Indicator
                Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.Center,
                        verticalAlignment = Alignment.CenterVertically
                ) {
                    repeat(3) { index ->
                        Box(
                                modifier =
                                        Modifier.size(8.dp)
                                                .clip(RoundedCornerShape(4.dp))
                                                .background(
                                                        if (index == 0) {
                                                            MaterialTheme.colorScheme.primary
                                                        } else {
                                                            MaterialTheme.colorScheme.outline
                                                        }
                                                )
                        )
                        if (index < 2) {
                            Spacer(modifier = Modifier.width(8.dp))
                        }
                    }
                }

                Spacer(modifier = Modifier.height(24.dp))

                Button(
                        onClick = {},
                        modifier =
                                Modifier.fillMaxWidth()
                                        .height(50.dp)
                                        .clip(RoundedCornerShape(12.dp)),
                        colors =
                                ButtonDefaults.buttonColors(
                                        containerColor = MaterialTheme.colorScheme.primary
                                )
                ) {
                    Text(
                            "Next",
                            style =
                                    TextStyle(
                                            fontSize = 16.sp,
                                            fontWeight = FontWeight.Medium,
                                            color = MaterialTheme.colorScheme.onPrimary
                                    )
                    )
                }

                Spacer(modifier = Modifier.height(12.dp))

                TextButton(onClick = {}, modifier = Modifier.fillMaxWidth()) {
                    Text(
                            "Skip",
                            style =
                                    TextStyle(
                                            fontSize = 14.sp,
                                            color = MaterialTheme.colorScheme.primary
                                    )
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun WelcomeCardComponentPreview() {
    MaterialTheme { WelcomeCardPreview() }
}

@Preview(showBackground = true)
@Composable
fun FeatureCardComponentPreview() {
    MaterialTheme {
        FeatureCardPreview(
                title = "Secure",
                description = "Local authentication",
                icon = "🔒",
                modifier = Modifier.width(150.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun QuickActionsPreview() {
    MaterialTheme {
        Column(
                modifier = Modifier.padding(16.dp),
                verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Text(
                    text = "Quick Actions",
                    style =
                            TextStyle(
                                    fontSize = 20.sp,
                                    fontWeight = FontWeight.SemiBold,
                                    color = MaterialTheme.colorScheme.onBackground
                            )
            )

            Card(
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(12.dp),
                    colors =
                            CardDefaults.cardColors(
                                    containerColor = MaterialTheme.colorScheme.surface
                            )
            ) {
                Column(modifier = Modifier.padding(16.dp)) {
                    ActionItemPreview(
                            icon = "⚙️",
                            title = "Settings",
                            description = "Manage app preferences"
                    )
                    HorizontalDivider(
                            modifier = Modifier.padding(vertical = 8.dp),
                            color = MaterialTheme.colorScheme.outline
                    )
                    ActionItemPreview(
                            icon = "❓",
                            title = "Help & Support",
                            description = "Get help and contact support"
                    )
                    HorizontalDivider(
                            modifier = Modifier.padding(vertical = 8.dp),
                            color = MaterialTheme.colorScheme.outline
                    )
                    ActionItemPreview(
                            icon = "ℹ️",
                            title = "About",
                            description = "App version and information"
                    )
                }
            }
        }
    }
}

@Composable
private fun ActionItemPreview(icon: String, title: String, description: String) {
    Row(
            modifier = Modifier.fillMaxWidth().padding(vertical = 4.dp),
            verticalAlignment = Alignment.CenterVertically
    ) {
        Text(text = icon, style = TextStyle(fontSize = 24.sp))
        Spacer(modifier = Modifier.width(16.dp))
        Column(modifier = Modifier.weight(1f)) {
            Text(
                    text = title,
                    style =
                            TextStyle(
                                    fontSize = 16.sp,
                                    fontWeight = FontWeight.Medium,
                                    color = MaterialTheme.colorScheme.onSurface
                            )
            )
            Text(
                    text = description,
                    style =
                            TextStyle(
                                    fontSize = 14.sp,
                                    color = MaterialTheme.colorScheme.onSurfaceVariant
                            )
            )
        }
        Text(
                text = "→",
                style =
                        TextStyle(
                                fontSize = 16.sp,
                                color = MaterialTheme.colorScheme.onSurfaceVariant
                        )
        )
    }
}
