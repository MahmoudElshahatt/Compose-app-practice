package com.shahtott.compose_example.ui.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.shahtott.compose_example.R
import com.shahtott.compose_example.ui.screens.components.DeterminateProgressIndicator
import com.shahtott.compose_example.ui.screens.components.GrayCard
import com.shahtott.compose_example.ui.screens.components.TextWithIcon
import com.shahtott.compose_example.ui.theme.ComposeExampleTheme
import com.shahtott.compose_example.ui.theme.colorGrayText


@Composable
fun ExampleScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 14.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "Your \nArchives",
                style = MaterialTheme.typography.displayMedium
                    .copy(
                        fontSize = 40.sp,
                        lineHeight = 36.sp,
                        letterSpacing = 0.4.sp,
                        fontWeight = FontWeight.Bold
                    )
            )
            Icon(
                modifier = Modifier.size(30.dp),
                imageVector = Icons.Default.Notifications,
                contentDescription = "notifications"
            )
        }

        Spacer(modifier = Modifier.height(24.dp))

        GrayCard(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp)
        ) {
            Box(modifier = Modifier.padding(24.dp)) {
                Column {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Column {
                            Text(
                                text = "Your score",
                                color = colorGrayText,
                                style = MaterialTheme.typography.titleMedium
                                    .copy(fontWeight = FontWeight.Medium)
                            )
                            Text(
                                text = "LEVEL 2",
                                style = MaterialTheme.typography.displayMedium
                                    .copy(
                                        fontSize = 30.sp,
                                        lineHeight = 36.sp,
                                        letterSpacing = 0.4.sp,
                                        fontWeight = FontWeight.Bold
                                    )
                            )
                        }
                        Card(
                            shape = RoundedCornerShape(16.dp),
                            colors = CardDefaults.cardColors(containerColor = Color.White)
                        ) {
                            Text(
                                modifier = Modifier.padding(vertical = 6.dp, horizontal = 16.dp),
                                text = "84%",
                                style = MaterialTheme.typography.displaySmall
                                    .copy(
                                        fontSize = 20.sp,
                                        fontWeight = FontWeight.Medium
                                    )
                            )
                        }
                    }

                    Spacer(modifier = Modifier.height(16.dp))

                    DeterminateProgressIndicator(progress = 80f)
                }
            }
        }

        Spacer(modifier = Modifier.height(24.dp))

        GrayCard(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp)
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(24.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Column {
                    Text(
                        text = "First\nTraining",
                        style = MaterialTheme.typography.displaySmall
                            .copy(
                                fontSize = 23.sp,
                                lineHeight = 28.sp,
                                letterSpacing = 0.4.sp,
                                fontWeight = FontWeight.Bold
                            )
                    )
                    Spacer(modifier = Modifier.height(4.dp))
                    TextWithIcon(
                        icon = Icons.Default.Check,
                        text = "Complete",
                    )
                }
                Image(
                    painter = painterResource(id = R.drawable.ic_cartoorn_icon),
                    contentDescription = "",
                    modifier = Modifier.size(80.dp)
                )
            }
        }

        Spacer(modifier = Modifier.height(14.dp))

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp)
        ) {
            GrayCard(
                modifier = Modifier
                    .weight(1f)
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(24.dp)
                ) {
                    Text(
                        text = "Develop\nGrowth",
                        style = MaterialTheme.typography.displaySmall
                            .copy(
                                fontSize = 23.sp,
                                lineHeight = 28.sp,
                                letterSpacing = 0.4.sp,
                                fontWeight = FontWeight.Bold
                            )
                    )
                    Spacer(modifier = Modifier.height(4.dp))

                    TextWithIcon(
                        icon = Icons.Default.Check,
                        text = "Complete"
                    )

                    Spacer(modifier = Modifier.height(4.dp))

                    Image(
                        painter = painterResource(id = R.drawable.ic_cartoorn_icon),
                        contentDescription = "",
                        modifier = Modifier
                            .size(80.dp)
                            .align(Alignment.End)
                    )
                }
            }

            Spacer(modifier = Modifier.width(16.dp))

            GrayCard(
                modifier = Modifier
                    .weight(1f)
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(24.dp)
                ) {
                    Text(
                        text = "Stretch\nMaster",
                        style = MaterialTheme.typography.displaySmall
                            .copy(
                                fontSize = 23.sp,
                                lineHeight = 28.sp,
                                letterSpacing = 0.4.sp,
                                fontWeight = FontWeight.Bold
                            )
                    )

                    Spacer(modifier = Modifier.height(4.dp))

                    TextWithIcon(
                        icon = Icons.Default.Check,
                        text = "Complete",
                    )
                    Spacer(modifier = Modifier.height(4.dp))

                    Image(
                        painter = painterResource(id = R.drawable.ic_cartoorn_icon),
                        contentDescription = "",
                        modifier = Modifier
                            .size(80.dp)
                            .align(Alignment.End)
                    )
                }
            }
        }

        Spacer(modifier = Modifier.weight(1f))

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(12.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                modifier = Modifier.size(30.dp),
                imageVector = Icons.Default.Home,
                contentDescription = ""
            )
            Spacer(modifier = Modifier.width(12.dp))

            Card(
                border = BorderStroke(
                    width = 1.dp,
                    color = Color.Black
                ),
                shape = RoundedCornerShape(16.dp),
                colors = CardDefaults.cardColors(containerColor = Color.White)
            ) {
                Row(
                    modifier = Modifier.padding(10.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        modifier = Modifier.size(30.dp),
                        imageVector = Icons.Default.Star,
                        contentDescription = ""
                    )

                    Text(
                        text = "Achives",
                        style = MaterialTheme.typography.bodyMedium
                            .copy(fontWeight = FontWeight.Medium)
                    )
                }
            }

            Spacer(modifier = Modifier.width(12.dp))

            Icon(
                modifier = Modifier.size(30.dp),
                imageVector = Icons.Default.Settings,
                contentDescription = ""
            )

            Spacer(modifier = Modifier.width(12.dp))

            Icon(
                modifier = Modifier.size(30.dp),
                imageVector = Icons.Default.Search,
                contentDescription = ""
            )
        }
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun ExampleScreenPreview() {
    ComposeExampleTheme {
        ExampleScreen()
    }
}