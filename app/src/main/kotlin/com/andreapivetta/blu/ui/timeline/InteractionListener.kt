package com.andreapivetta.blu.ui.timeline

import twitter4j.Status
import twitter4j.User

/**
 * Created by andrea on 22/05/16.
 */
interface InteractionListener {

    fun favorite(status: Status)

    fun retweet(status: Status)

    fun unfavorite(status: Status)

    fun unretweet(status: Status)

    fun reply(status: Status, user: User)

    fun openTweet(status: Status, user: User)

    fun showUser(user: User)

    fun showImage(imageUrl: String)

    fun showImages(imageUrls: List<String>, index: Int)

    fun showVideo(videoUrl: String, videoType: String)

}