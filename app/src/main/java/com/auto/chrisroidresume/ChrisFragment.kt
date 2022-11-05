package com.auto.chrisroidresume

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.auto.chrisroidresume.databinding.FragmentChrisBinding

// TODO: Rename parameter arguments, choose names that match


/**
 * A simple [Fragment] subclass.
 * Use the [ChrisFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ChrisFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var _binding: FragmentChrisBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentChrisBinding.inflate(inflater, container, false)


        binding.twitterLink.setOnClickListener {
            getUrlFromTwitterIntent()
        }
        binding.constraintLayout2.setOnClickListener {
            Toast.makeText(activity, "Click on the blue arrow to visit my Twitter Profile", Toast.LENGTH_SHORT).show()
        }

        binding.githubLink.setOnClickListener {
            getUrlFromGithubIntent()
        }
        binding.constraintLayout3.setOnClickListener {
            Toast.makeText(activity, "Click on the blue arrow to visit my Github Profile", Toast.LENGTH_SHORT).show()
        }
        binding.linkedinLink.setOnClickListener {
            getUrlFromLinkedinIntent()
        }
        binding.constraintLayout7.setOnClickListener {
            Toast.makeText(activity, "Click on the blue arrow to visit my Linkedin Profile", Toast.LENGTH_SHORT).show()
        }

        return binding.root

    }

    private fun getUrlFromTwitterIntent() {
        val url = "https://twitter.com/chrisroid"
        val intent = Intent(Intent.ACTION_VIEW)
        intent.data = Uri.parse(url)
        startActivity(intent)
    }

    private fun getUrlFromGithubIntent() {
        val url = "https://github.com/chrisroid"
        val intent = Intent(Intent.ACTION_VIEW)
        intent.data = Uri.parse(url)
        startActivity(intent)
    }
    private fun getUrlFromLinkedinIntent() {
        val url = "https://www.linkedin.com/in/christianasarhasa2019"
        val intent = Intent(Intent.ACTION_VIEW)
        intent.data = Uri.parse(url)
        startActivity(intent)
    }

}