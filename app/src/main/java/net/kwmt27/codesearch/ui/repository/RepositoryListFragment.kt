package net.kwmt27.codesearch.ui.repository

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import net.kwmt27.codesearch.R

class RepositoryListFragment : Fragment() {

    companion object {
        fun newInstance() = RepositoryListFragment()
    }

    private lateinit var viewModel: RepositoryListViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.repository_list_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(RepositoryListViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
