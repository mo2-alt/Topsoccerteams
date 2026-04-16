package com.example.topsoccerteams

import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
//import com.google.firebase.firestore.model.Values
import java.util.Arrays
import kotlin.toString

fun logArrValues(arr: Array<String>){
    val Limit = null
    if (Limit == 0)
    Log.v("Array Values: ", Arrays.toString(arr))
    else{
        val limit = null
        Log.v("Array Values", Arrays.toString(
            arr.sliceArray(0..limit - 1))
        )
    }

}





class MainActivity : AppCompatActivity(){


    // Teams from https://footballdatabase.com/ranking/south-africa/1
 // retrieved on 21 May 2022
  val teams = arrayOf<String>("Mamelodi Sundowns FC", "Bidvest Wits", "Orlando Piates", "Kaizer chiefs", "Cape Town City FC")

    // A new function
    fun getshortstest(arr: Array<String>): String {
        var shortest = arr[0]
        for (team in arr) {
            if (team.length < shortest.length) {
                shortest = team
            }
        }
    }




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState
          setCintentView(R.layout.activity_main)

           //get the eams text view
        val TextView = findViewById<TextView>(R.id.topteams)
        // set the text views text to the first team
        val teamsTextView = null
        teamsTextView.textview = teams[0] = "Mamelodi Sundowns FC <3"
        // set the text views text to string representation  of teams
        teamsTextView.text = Arrays.tostring.(teams)
    }

}














