package com.example.codingassignment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.View.inflate
import android.view.ViewGroup
import android.widget.RadioGroup
import androidx.appcompat.resources.Compatibility.Api21Impl.inflate
import androidx.core.graphics.drawable.DrawableCompat.inflate
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.codingassignment.databinding.ImagelistBinding

class ImageFragment : Fragment() {
    private var _binding: ImagelistBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Retrieve and inflate the layout for this fragment
        _binding = ImagelistBinding.inflate(inflater,container,false)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val recyclerView = binding.recyclerView
        binding.recyclerView.layoutManager=when(layout)
        {
            1->GridLayoutManager(context,2)
            2->GridLayoutManager(context,3)
            else->GridLayoutManager(context,4)
        }
        recyclerView.adapter=Imageadapter()
    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}