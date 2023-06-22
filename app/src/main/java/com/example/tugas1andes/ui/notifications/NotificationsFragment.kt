package com.example.tugas1andes.ui.notifications

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.Fragment
import com.example.tugas1andes.R

class NotificationsFragment : Fragment(), View.OnClickListener {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_notifications, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val instagramButton1 :ImageView= view.findViewById(R.id.instagramlogo1)
        instagramButton1.setOnClickListener(this)
        val linkedInButton1 : ImageView = view.findViewById(R.id.linkedInlogo1)
        linkedInButton1.setOnClickListener(this)
        val instagramButton2 :ImageView= view.findViewById(R.id.instagramlogo2)
        instagramButton2.setOnClickListener(this)
        val linkedInButton2 : ImageView = view.findViewById(R.id.linkedInlogo2)
        linkedInButton2.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id) {
            R.id.instagramlogo1 -> {
                val instagram = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/andes_a_f/"))
                startActivity(instagram)
            }
            R.id.linkedInlogo1 -> {
                val linkedIn = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com/in/andes-andedia-60903a21b/"))
                startActivity(linkedIn)
            }
            R.id.instagramlogo2 -> {
                val instagram = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/mataharipradipta/"))
                startActivity(instagram)
            }
            R.id.linkedInlogo2 -> {
                val linkedIn = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com/in/matahari-pradipta-676120268/"))
                startActivity(linkedIn)
            }
        }
    }
}