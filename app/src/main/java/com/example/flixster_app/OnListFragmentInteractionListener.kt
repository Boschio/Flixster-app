package com.example.flixster_app

import android.util.Log
import android.widget.Toast

/**
 * This interface is used by the [MoviesRecyclerViewAdapter] to ensure
 * it has an appropriate Listener.
 *
 * In this app, it's implemented by [MoviesFragment]
 */
interface OnListFragmentInteractionListener {
    fun onItemClick(item: Movie)
}
