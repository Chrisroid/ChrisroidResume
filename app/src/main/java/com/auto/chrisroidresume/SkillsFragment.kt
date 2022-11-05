
package com.auto.chrisroidresume

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.auto.chrisroidresume.databinding.FragmentChrisBinding
import com.auto.chrisroidresume.databinding.FragmentSkillsBinding

// TODO: Rename parameter arguments, choose names that match

/**
 * A simple [Fragment] subclass.
 * Use the [SkillsFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class SkillsFragment : Fragment() {

    private var _binding: FragmentSkillsBinding? = null
    private val binding get() = _binding!!


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentSkillsBinding.inflate(inflater, container, false)
        return binding.root
    }
}