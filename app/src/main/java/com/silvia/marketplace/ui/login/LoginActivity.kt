package com.silvia.marketplace.ui.login

import android.nfc.Tag
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import com.silvia.marketplace.R
import com.silvia.marketplace.databinding.ActivityLoginBinding
import com.silvia.marketplace.databinding.FragmentDashboardBinding
import com.silvia.marketplace.util.Prefs

class LoginActivity : AppCompatActivity() {
    private var _binding: ActivityLoginBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val s = Prefs(this)
        if (s.getIsLogin()){
            binding.tvStatus.text ="SUDAH LOGIN"
        }else binding.tvStatus.text="BELUM LOGIN"
        binding.btnLogin.setOnClickListener{
            s.setIsLogin(true)
            onBackPressed()
        }
        binding.btnLogout.setOnClickListener{
            s.setIsLogin(false)
            onBackPressed()
        }
        Log.d ("RESPON", "PESAN SINGKAT")

    }
}