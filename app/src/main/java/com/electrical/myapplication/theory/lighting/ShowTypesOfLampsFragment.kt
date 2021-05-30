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
    private var countClick5 = 0
    private var countClick6 = 0
    private var countClick7 = 0
    private var countClick8 = 0
    private var countClick9 = 0
    private var countClick10 = 0

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
        bindingTypesLamps.layoutDescriptionLightingTypesOfLamps5.setOnClickListener {
            if (countClick5 % 2 == 0) {
                countClick5++
                bindingTypesLamps.iconDescriptionUpDown5.setBackgroundResource(R.drawable.ic_info_sockets_plugs_up)
                bindingTypesLamps.descriptionLightingTypesOfLamps5.text =
                    getString(R.string.info_description_lighting_types_of_lamps_5)
            } else {
                countClick5++
                bindingTypesLamps.descriptionLightingTypesOfLamps5.text = ""
                bindingTypesLamps.iconDescriptionUpDown5.setBackgroundResource(R.drawable.ic_info_sockets_plugs_down)
            }
        }
        bindingTypesLamps.layoutDescriptionLightingTypesOfLamps6.setOnClickListener {
            if (countClick6 % 2 == 0) {
                countClick6++
                bindingTypesLamps.iconDescriptionUpDown6.setBackgroundResource(R.drawable.ic_info_sockets_plugs_up)
                bindingTypesLamps.descriptionLightingTypesOfLamps6.text =
                    getString(R.string.info_description_lighting_types_of_lamps_6)
            } else {
                countClick6++
                bindingTypesLamps.descriptionLightingTypesOfLamps6.text = ""
                bindingTypesLamps.iconDescriptionUpDown6.setBackgroundResource(R.drawable.ic_info_sockets_plugs_down)
            }
        }
        bindingTypesLamps.layoutDescriptionLightingTypesOfLamps7.setOnClickListener {
            if (countClick7 % 2 == 0) {
                countClick7++
                bindingTypesLamps.iconDescriptionUpDown7.setBackgroundResource(R.drawable.ic_info_sockets_plugs_up)
                bindingTypesLamps.descriptionLightingTypesOfLamps7.text =
                    getString(R.string.info_description_lighting_types_of_lamps_7)
            } else {
                countClick7++
                bindingTypesLamps.descriptionLightingTypesOfLamps7.text = ""
                bindingTypesLamps.iconDescriptionUpDown7.setBackgroundResource(R.drawable.ic_info_sockets_plugs_down)
            }
        }
        bindingTypesLamps.layoutDescriptionLightingTypesOfLamps8.setOnClickListener {
            if (countClick8 % 2 == 0) {
                countClick8++
                bindingTypesLamps.iconDescriptionUpDown8.setBackgroundResource(R.drawable.ic_info_sockets_plugs_up)
                bindingTypesLamps.descriptionLightingTypesOfLamps8.text =
                    getString(R.string.info_description_lighting_types_of_lamps_8)
            } else {
                countClick8++
                bindingTypesLamps.descriptionLightingTypesOfLamps8.text = ""
                bindingTypesLamps.iconDescriptionUpDown8.setBackgroundResource(R.drawable.ic_info_sockets_plugs_down)
            }
        }
        bindingTypesLamps.layoutDescriptionLightingTypesOfLamps9.setOnClickListener {
            if (countClick9 % 2 == 0) {
                countClick9++
                bindingTypesLamps.iconDescriptionUpDown9.setBackgroundResource(R.drawable.ic_info_sockets_plugs_up)
                bindingTypesLamps.descriptionLightingTypesOfLamps9.text =
                    getString(R.string.info_description_lighting_types_of_lamps_9)
            } else {
                countClick9++
                bindingTypesLamps.descriptionLightingTypesOfLamps9.text = ""
                bindingTypesLamps.iconDescriptionUpDown9.setBackgroundResource(R.drawable.ic_info_sockets_plugs_down)
            }
        }
        bindingTypesLamps.layoutDescriptionLightingTypesOfLamps10.setOnClickListener {
            if (countClick10 % 2 == 0) {
                countClick10++
                bindingTypesLamps.iconDescriptionUpDown10.setBackgroundResource(R.drawable.ic_info_sockets_plugs_up)
                bindingTypesLamps.descriptionLightingTypesOfLamps10.text =
                    getString(R.string.info_description_lighting_types_of_lamps_10)
            } else {
                countClick10++
                bindingTypesLamps.descriptionLightingTypesOfLamps10.text = ""
                bindingTypesLamps.iconDescriptionUpDown10.setBackgroundResource(R.drawable.ic_info_sockets_plugs_down)
            }
        }
    }
}