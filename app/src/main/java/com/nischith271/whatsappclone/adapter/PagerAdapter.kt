package com.nischith271.whatsappclone.adapter

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.nischith271.whatsappclone.pages.CallsFragment
import com.nischith271.whatsappclone.pages.ChatsFragment
import com.nischith271.whatsappclone.pages.StatusFragment

class PagerAdapter(fragment: Fragment): FragmentStateAdapter(fragment) {
    override fun getItemCount(): Int = 3

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            1 -> StatusFragment()
            2 -> CallsFragment()
            else -> ChatsFragment()
        }
    }
}