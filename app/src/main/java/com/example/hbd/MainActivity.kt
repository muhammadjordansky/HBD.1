//Berfungsi sebagai pemanggil paket com.example.hbd
package com.example.hbd
//Berfungsi untuk import kelas androidx.appcompat.appAppCompatActivity
import androidx.appcompat.app.AppCompatActivity
//Berfungsi untuk impor kelas android.os.Bundle
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}