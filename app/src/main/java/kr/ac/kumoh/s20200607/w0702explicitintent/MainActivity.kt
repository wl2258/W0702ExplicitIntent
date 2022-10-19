package kr.ac.kumoh.s20200607.w0702explicitintent

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kr.ac.kumoh.s20200607.w0702explicitintent.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnExplicitIntent.setOnClickListener {
            //Toast.makeText(this, "눌렸습니다", Toast.LENGTH_SHORT).show() //static 메소드를 사용했으므로 show를 반드시 호출 해줘야 함!!
            val intent = Intent(this, ImageActivity::class.java)
            startActivity(intent)
        }

        binding.btnImplicitIntent.setOnClickListener {
            val uri = Uri.parse("https://www.youtube.com/results?search_query=" + binding.editText.text)
            val intent = Intent(Intent.ACTION_VIEW, uri)
            startActivity(intent)
        }
    }
}