package com.example.tugas1andes.ui.notifications

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.tugas1andes.R
import com.example.tugas1andes.databinding.FragmentNotificationsBinding

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

        val instagramButton : Button = view.findViewById(R.id.buttonToInstagram)
        instagramButton.setOnClickListener(this)
        val linkedInButton : Button = view.findViewById(R.id.buttonToLinkedIn)
        linkedInButton.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id) {
            R.id.buttonToInstagram -> {
                val instagram = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/andes_a_f/"))
                startActivity(instagram)
            }
            R.id.buttonToLinkedIn -> {
                val linkedIn = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com/in/andes-andedia-60903a21b/"))
                startActivity(linkedIn)
            }
        }
    }
}