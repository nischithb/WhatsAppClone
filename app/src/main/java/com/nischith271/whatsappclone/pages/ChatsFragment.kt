package com.nischith271.whatsappclone.pages

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.nischith271.whatsappclone.R
import com.nischith271.whatsappclone.adapter.ChatsListAdapter
import com.nischith271.whatsappclone.databinding.FragmentChatsBinding
import com.nischith271.whatsappclone.models.Contact

class ChatsFragment : Fragment() {
    private var _binding: FragmentChatsBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentChatsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val dataset = listOf<Contact>(Contact("Tony", 2122222))
        binding.chatsRecyclerView.adapter = ChatsListAdapter(dataset)
    }
}