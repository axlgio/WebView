package com.example.webview

import Hotel
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.webview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    val decameronUrl =
        "https://www.decameron.com/es/ceca-promociones?utm_source=google&utm_medium=cpc&utm_campaign=sv-decameron-beach_days-perf&utm_content=promociones-conv-cpc-texto&gclid=Cj0KCQjwsZKJBhC0ARIsAJ96n3Xjo1xGfneIf674k5ehH2bPkZPkL-kbNughpEWY-M5-NTsVDb6Z2CQaAqWXEALw_wcB"
    val hotels = arrayListOf<Hotel>(
        Hotel(
            name = "Intercontinental",
            description = " Boulevard De Los Heroes, Y Avenue Sisimiles, San Salvador",
            url =
            "https://www.intercontinental.com/hotels/us/en/reservation?fromRedirect=true&qSrt=sBR&qIta=99629025&icdv=99629025&setPMCookies=true&dp=true&gclid=EAIaIQobChMI1Pmj1JfL8gIVgp-zCh2GBgP_EAAYASAAEgKV1vD_BwE&cm_mmc=PDSEA-_-G%7CF-AMER%7CFS-MLAC%7CH-AMER%7CHS-MLAC%7CIC%7CBRI%7CEXM%7CCORE-INTERCONTINENTAL&srb_u=1"
        ),
        Hotel(
            name = "Pacific Paradise",
            description = "KM 75 boulevard costa del sol, La Herradura 1606 El Salvador",
            url ="https://www.tripadvisor.com.mx/Hotel_Review-g659267-d3216958-Reviews-Pacific_Paradise-La_Herradura_La_Paz_Department . html "
        ),
        Hotel(
            name = "Mar y Sol Hotel Restaurante",
            description = "Conchagua, La Unión, El Salvador",
            url = "https://www.hotel-marysol.com/es/index.html"
        ),
        Hotel(
            name = "Crowne Plaza",
            description = "San Salvador, Colonia Escalon",
            url =
            "https://www.ihg.com/crowneplaza/hotels/us/es/reservation#_gl=1*e1t0ec*_gcl_aw*R0NMLjE2Mjk4NjU2OTAuRUFJYUlRb2JDaE1JbS1UVHo1akw4Z0lWU3VLekNoMmlQd1A4RUFBWUFTQUFFZ0tSYlBEX0J3RQ .."
        )
    )
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setInformation()
        addListener()
    }

    private fun setInformation() {
        binding.apply {
            tvTitle1.text = hotels[0].name
            tvDescription1.text = hotels[0].description
            tvTitle2.text = hotels[1].name
            tvDescription2.text = hotels[1].description
            tvTitle3.text = hotels[2].name
            tvDescription3.text = hotels[2].description
            tvTitle4.text = hotels[3].name
            tvDescription4.text = hotels[3].description
        }
    }

    private fun addListener() {
        val intent = Intent(this, WebViewActivity::class.java)
        val key = "url"
        binding.apply {
            btnDecameron.setOnClickListener {
                intent.putExtra(key, decameronUrl)
                startActivity(intent)
            }
            btnItem1.setOnClickListener {
                intent.putExtra(key, hotels[0].url)
                startActivity(intent)
            }
            btnItem2.setOnClickListener {
                intent.putExtra(key, hotels[1].url)
                startActivity(intent)
            }
            btnItem3.setOnClickListener {
                intent.putExtra(key, hotels[2].url)
                startActivity(intent)
            }
            btnItem4.setOnClickListener {
                intent.putExtra(key, hotels[3].url)
                startActivity(intent)
            }
        }
    }
}
