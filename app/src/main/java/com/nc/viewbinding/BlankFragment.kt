package com.nc.viewbinding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.nc.viewbinding.databinding.FragmentBlankBinding


class BlankFragment : Fragment() {
        var  binding: FragmentBlankBinding? =null
        var binding_type=binding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
            binding= FragmentBlankBinding.inflate(layoutInflater,container,false)
        binding_type!!.button3.setOnClickListener {
            binding!!.button3.text="button Click"
        }
        return binding_type!!.root


    }

    override fun onDestroy() {
        super.onDestroy()
        binding=null
    }


}