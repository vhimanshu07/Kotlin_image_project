package com.example.codingassignment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.View.inflate
import android.view.ViewGroup
import androidx.core.content.res.ColorStateListInflaterCompat.inflate
import androidx.navigation.Navigation
import androidx.navigation.fragment.FragmentNavigator
import androidx.recyclerview.widget.GridLayoutManager
import com.example.codingassignment.databinding.ActivityMainBinding.inflate
import com.example.codingassignment.databinding.FragmentMainscreenfragmentBinding
import com.example.codingassignment.databinding.ImagelistBinding


class Mainscreenfragment : Fragment() {
    private  var _binding: FragmentMainscreenfragmentBinding ?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentMainscreenfragmentBinding.inflate(inflater,container,false)
        return binding.root
    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        binding.done.setOnClickListener {
            layout= when((binding.radiosel).checkedRadioButtonId)
            {
                R.id.sel1->1
                R.id.sel2->2
                R.id.sel3->3
                else ->1
            }
            Navigation.findNavController(view).navigate(R.id.imageFragment)

        }
    }


}