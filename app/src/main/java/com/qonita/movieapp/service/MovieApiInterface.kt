package com.qonita.movieapp.service

    import com.qonita.movieapp.model.MovieResponse
    import retrofit2.Call
    import retrofit2.http.GET

    interface MovieApiInterface {
        @GET("/3/movie/popular?api_key=f2ac3e38ad009f8223f3e6f1ff47402b")
        fun getMovieList(): Call<MovieResponse>
    }
