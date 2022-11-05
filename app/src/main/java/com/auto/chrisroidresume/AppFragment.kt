package com.auto.chrisroidresume

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.auto.chrisroidresume.databinding.FragmentAppBinding
import com.auto.chrisroidresume.databinding.FragmentChrisBinding

/**
 * A simple [Fragment] subclass.
 * Use the [AppFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class AppFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var _binding: FragmentAppBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentAppBinding.inflate(inflater, container, false)

        return binding.root
    }
}