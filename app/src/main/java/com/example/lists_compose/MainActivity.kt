package com.example.lists_compose

import android.content.ClipData.Item
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.lists_compose.ui.theme.Lists_composeTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Lists_composeTheme {
               Surface(modifier = Modifier.fillMaxSize(),
                   color = MaterialTheme.colorScheme.background) {
                   
                   val navHostController = rememberNavController()
                   
                   NavHost(navController = navHostController, startDestination = "home_screen"){
                       
                       composable("home_screen"){
                           
                           HomeScreen(navHostController = navHostController)
                           
                       }

                       composable("lazy_row_screen"){

                           LazyRowScreen()

                       }

                       composable("lazy_column_screen"){

                           LazyColumnScreen()

                       }

                       composable("lazy_grid_screen"){

                           LazyGridScreen()

                       }
                       
                       
                   }

               }
            }
        }
    }

    companion object{

        val items = listOf(

            Item(
                title = "item 1",
                image = R.drawable.nature
            ),
            Item(
                title = "item 2",
                image = R.drawable.cat
            ),
            Item(
                title = "item 2",
                image = R.drawable.sun
            ),
            Item(
                title = "item 1",
                image = R.drawable.nature
            ),
            Item(
                title = "item 2",
                image = R.drawable.cat
            ),
            Item(
                title = "item 2",
                image = R.drawable.sun
            ),
            Item(
                title = "item 1",
                image = R.drawable.nature
            ),
            Item(
                title = "item 2",
                image = R.drawable.cat
            ),
            Item(
                title = "item 2",
                image = R.drawable.sun
            )

        )

    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Lists_composeTheme {

    }
}


@Composable
fun HomeScreen(navHostController: NavHostController){

    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment =  Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center) {

        Button(onClick = { navHostController.navigate("lazy_row_screen") }) {
            
            Text(text = "Lazy Row")
            
        }
        
        Spacer(modifier = Modifier.height(30.dp))

        Button(onClick = { navHostController.navigate("lazy_column_screen") }) {

            Text(text = "Lazy Row")

        }

        Spacer(modifier = Modifier.height(30.dp))

        Button(onClick = { navHostController.navigate("lazy_grid_screen") }) {

            Text(text = "Lazy Grid")

        }

        Spacer(modifier = Modifier.height(30.dp))

    }

}

