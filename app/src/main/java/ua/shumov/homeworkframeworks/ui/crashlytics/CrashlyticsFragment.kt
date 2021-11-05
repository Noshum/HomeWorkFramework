package ua.shumov.homeworkframeworks.ui.crashlytics

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import kotlinx.android.synthetic.main.fragment_crashlytics.*
import ua.shumov.homeworkframeworks.databinding.FragmentCrashlyticsBinding

class CrashlyticsFragment : Fragment() {

    private lateinit var crashlyticsViewModel: CrashlyticsViewModel
    private var _binding: FragmentCrashlyticsBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        btn_crash.setOnClickListener {
            throw RuntimeException("Test Crash")
        }
        crashlyticsViewModel =
            ViewModelProvider(this).get(CrashlyticsViewModel::class.java)

        _binding = FragmentCrashlyticsBinding.inflate(inflater, container, false)
        val root: View = binding.root
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}