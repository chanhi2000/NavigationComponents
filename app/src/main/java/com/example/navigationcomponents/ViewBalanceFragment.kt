package com.example.navigationcomponents

import android.content.Context
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
/**
 * A simple [Fragment] subclass.
 * Activities that contain this fragment must implement the
 * [ViewBalanceFragment.OnFragmentInteractionListener] interface
 * to handle interaction events.
 * Use the [ViewBalanceFragment.newInstance] factory method to
 * create an instance of this fragment.
 *
 */
class ViewBalanceFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_view_balance, container, false)
    }
}
