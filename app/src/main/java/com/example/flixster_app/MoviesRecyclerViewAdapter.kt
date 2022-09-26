package com.example.flixster_app

import android.content.Intent
import android.net.Uri
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.core.net.toUri
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.flixster_app.R.id
import kotlin.math.log

class MoviesRecyclerViewAdapter (
    private val movies: List<Movie>,
    private val mListener: OnListFragmentInteractionListener?
    )
    : RecyclerView.Adapter<MoviesRecyclerViewAdapter.MovieViewHolder>()
    {
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
            val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.fragment_movie, parent, false)
            return MovieViewHolder(view)
        }

        /**
         * This inner class lets us refer to all the different View elements
         * (Yes, the same ones as in the XML layout files!)
         */
        inner class MovieViewHolder(val mView: View) : RecyclerView.ViewHolder(mView) {
            var mItem: Movie? = null
            val mMovieTitle: TextView = mView.findViewById<View>(id.movie_title) as TextView
            val mMoviePoster: ImageView = mView.findViewById<View>(id.movie_poster) as ImageView
            val mMovieOverview: TextView = mView.findViewById<View>(id.movie_overview) as TextView

            override fun toString(): String {
                return mMovieTitle.toString() + " '" + mMovieOverview.text + "'"
            }
        }

        /**
         * This lets us "bind" each Views in the ViewHolder to its' actual data!
         */
        override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
            val movie = movies[position]

            holder.mItem = movie
            holder.mMovieTitle.text = movie.title
            holder.mMovieOverview.text = movie.overview

            val moviePoster: String = "http://image.tmdb.org/t/p/w200${movie.posterImageUrl}"
            println(moviePoster)

            Glide.with(holder.mView)
                .load(moviePoster.toUri().buildUpon().scheme("https").build())
                .centerInside()
                .into(holder.mMoviePoster)

            holder.mView.setOnClickListener {
                holder.mItem?.let { movie ->
                    mListener?.onItemClick(movie)
                }
            }

        }

        /**
         * Remember: RecyclerView adapters require a getItemCount() method.
         */
        override fun getItemCount(): Int {
            return movies.size
        }
    }