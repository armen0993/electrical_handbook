package com.electrical.myapplication.theory.lighting


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.electrical.myapplication.R
import com.electrical.myapplication.databinding.FragmentShowLightingTypesOfLampsBinding

class ShowTypesOfLampsFragment : Fragment() {
    private var countClick = 0
    private var countClick1 = 0
    private var countClick2 = 0
    private var countClick3 = 0
    private var countClick4 = 0

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_show_lighting_types_of_lamps, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val bindingTypesLamps = FragmentShowLightingTypesOfLampsBinding.bind(view)

        bindingTypesLamps.layoutDescriptionLightingTypesOfLamps.setOnClickListener {
            if (countClick % 2 == 0) {
                countClick++
                bindingTypesLamps.iconDescriptionUpDown.setBackgroundResource(R.drawable.ic_info_sockets_plugs_up)
                bindingTypesLamps.descriptionLightingTypesOfLamps.text =
                    getString(R.string.info_description_lighting_types_of_lamps)
            } else {
                countClick++
                bindingTypesLamps.descriptionLightingTypesOfLamps.text = ""
                bindingTypesLamps.iconDescriptionUpDown.setBackgroundResource(R.drawable.ic_info_sockets_plugs_down)
            }
        }
        bindingTypesLamps.layoutDescriptionLightingTypesOfLamps1.setOnClickListener {
            if (countClick1 % 2 == 0) {
                countClick1++
                bindingTypesLamps.iconDescriptionUpDown1.setBackgroundResource(R.drawable.ic_info_sockets_plugs_up)
                bindingTypesLamps.descriptionLightingTypesOfLamps1.text =
                    getString(R.string.info_description_lighting_types_of_lamps_1)
            } else {
                countClick1++
                bindingTypesLamps.descriptionLightingTypesOfLamps1.text = ""
                bindingTypesLamps.iconDescriptionUpDown1.setBackgroundResource(R.drawable.ic_info_sockets_plugs_down)
            }
        }
        bindingTypesLamps.layoutDescriptionLightingTypesOfLamps2.setOnClickListener {
            if (countClick2 % 2 == 0) {
                countClick2++
                bindingTypesLamps.iconDescriptionUpDown2.setBackgroundResource(R.drawable.ic_info_sockets_plugs_up)
                bindingTypesLamps.descriptionLightingTypesOfLamps2.text =
                    getString(R.string.info_description_lighting_types_of_lamps_2)
            } else {
                countClick2++
                bindingTypesLamps.descriptionLightingTypesOfLamps2.text = ""
                bindingTypesLamps.iconDescriptionUpDown2.setBackgroundResource(R.drawable.ic_info_sockets_plugs_down)
            }
        }
        bindingTypesLamps.layoutDescriptionLightingTypesOfLamps3.setOnClickListener {
            if (countClick3 % 2 == 0) {
                countClick3++
                bindingTypesLamps.iconDescriptionUpDown3.setBackgroundResource(R.drawable.ic_info_sockets_plugs_up)
                bindingTypesLamps.descriptionLightingTypesOfLamps3.text =
                    getString(R.string.info_description_lighting_types_of_lamps_3)
            } else {
                countClick3++
                bindingTypesLamps.descriptionLightingTypesOfLamps3.text = ""
                bindingTypesLamps.iconDescriptionUpDown3.setBackgroundResource(R.drawable.ic_info_sockets_plugs_down)
            }
        }
        bindingTypesLamps.layoutDescriptionLightingTypesOfLamps4.setOnClickListener {
            if (countClick4 % 2 == 0) {
                countClick4++
                bindingTypesLamps.iconDescriptionUpDown4.setBackgroundResource(R.drawable.ic_info_sockets_plugs_up)
                bindingTypesLamps.descriptionLightingTypesOfLamps4.text =
                    getString(R.string.info_description_lighting_types_of_lamps_4)
            } else {
                countClick4++
                bindingTypesLamps.descriptionLightingTypesOfLamps4.text = ""
                bindingTypesLamps.iconDescriptionUpDown4.setBackgroundResource(R.drawable.ic_info_sockets_plugs_down)
            }
        }
    }
}