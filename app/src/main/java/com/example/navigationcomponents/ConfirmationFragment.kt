package com.example.navigationcomponents

import android.content.Context
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

/**
 * A simple [Fragment] subclass.
 * Activities that contain this fragment must implement the
 * [ConfirmationFragment.OnFragmentInteractionListener] interface
 * to handle interaction events.
 * Use the [ConfirmationFragment.newInstance] factory method to
 * create an instance of this fragment.
 *
 */
class ConfirmationFragment : Fragment() {

    private lateinit var recipient: String
    private lateinit var money: Money

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        recipient = arguments!!.getString("recipient")
        money = arguments!!.getParcelable("amount")
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val amount = money!!.amount
        val confirmationMessage = "you have sent $ $amount to $recipient"
        view.findViewById<TextView>(R.id.confirmation_message).text = confirmationMessage
    }

    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_confirmation, container, false)
    }
}
