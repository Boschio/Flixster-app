package com.example.flixster_app

/**
 * This interface is used by the [MoviesRecyclerViewAdapter] to ensure
 * it has an appropriate Listener.
 *
 * In this app, it's implemented by [MovieFragment]
 */
interface OnListFragmentInteractionListener {
    fun onItemClick(item: Movie)
}
