# Android Project 3 - *Flixster-app*

Submitted by: **James A. Bosch**

**Flixster-app** is a movie browsing app that allows users to browse movies currently playing in theaters.

Time spent: **6** hours spent in total

## Required Features

The following **required** functionality is completed:

- [x] **Make a request to [The Movie Database API's `now_playing`](https://developers.themoviedb.org/3/movies/get-now-playing) endpoint to get a list of current movies**
- [x] **Parse through JSON data and implement a RecyclerView to display all movies**
- [x] **Use Glide to load and display movie poster images**

The following **optional** features are implemented:

- [ ] Improve and customize the user interface through styling and coloring
- [ ] Implement orientation responsivity
  - App should neatly arrange data in both landscape and portrait mode
- [ ] Implement Glide to display placeholder graphics during loading
  - Note: this feature is difficult to capture in a GIF without throttling internet speeds.  Instead, include an additional screencap of your Glide code implementing the feature.  (<10 lines of code)

The following **additional** features are implemented:

- [x] Securely storing my API key using a BuildConfig file
- [x] Added dialog modal when a movie is clicked, allowing you to view the title, release date and full overview (including text that did not fit on main screen)

## Video Walkthrough

Here's a walkthrough of implemented user stories:

<img src='flixster-app.gif' title='Video Walkthrough' width='' alt='Video Walkthrough' />

## Notes

Describe any challenges encountered while building the app:

I found it difficult to implement a way to securely store my API key, which led me to learning a bit about using a BuildConfig file. 

I also had trouble with the picture and movie details placement, as I kept having them overlap, despite my constraints showing they should not.

## License

    Copyright [2022] [James A. Bsch]

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

        http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
