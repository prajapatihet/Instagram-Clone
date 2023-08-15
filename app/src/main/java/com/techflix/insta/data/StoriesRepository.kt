package com.techflix.insta.data

import kotlinx.coroutines.ExperimentalCoroutinesApi
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import com.techflix.insta.model.Story
import com.techflix.insta.model.currentUser
import com.techflix.insta.model.names


@OptIn(ExperimentalCoroutinesApi::class)
object StoriesRepository {

    private val stories = mutableStateOf<List<Story>>(emptyList())

    private fun populateStories() {
        val _stories = ArrayList<Story>()

        _stories.add(
            Story(
                image = currentUser.image,
                name = "Your Story"
            )
        )

        (0..9).forEach { index ->
            val story = Story(
                image = "https://randomuser.me/api/portraits/men/${index + 1}.jpg",
                name = names[index]
            )
            _stories.add(story)
        }

        stories.value = _stories
    }

    init {
        populateStories()
    }

    fun observeStories(): MutableState<List<Story>> = stories

}