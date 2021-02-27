/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.puppylist.androiddevchallenge.ui

import androidx.lifecycle.ViewModel
import com.puppylist.androiddevchallenge.ui.data.Gender
import com.puppylist.androiddevchallenge.ui.data.Puppy

class PuppyModel : ViewModel() {
    val puppies = listOf(
        Puppy(
            id = 1,
            name = "Puppy 1",
            nickName = "Ace",
            gender = Gender.FEMALE,
            ageInMonth = 6,
            lengthInFeet = 1f,
            distanceInMiles = 10,
            color = "White",
            imageUrl = "https://images.unsplash.com/photo-1583511655857-d19b40a7a54e?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=MXwxODQ1NjZ8MHwxfHNlYXJjaHwxfHxkb2d8ZW58MHx8fA&ixlib=rb-1.2.1&q=80&w=400"
        ),
        Puppy(
            id = 2,
            name = "Puppy 2",
            nickName = "Apollo",
            gender = Gender.MALE,
            ageInMonth = 8,
            lengthInFeet = 1.2f,
            distanceInMiles = 12,
            color = "Black",
            imageUrl = "https://images.unsplash.com/photo-1552053831-71594a27632d?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=MXwxODQ1NjZ8MHwxfHNlYXJjaHwyfHxkb2d8ZW58MHx8fA&ixlib=rb-1.2.1&q=80&w=400"
        ),
        Puppy(
            id = 3,
            name = "Puppy 3",
            nickName = "Bailey",
            gender = Gender.FEMALE,
            ageInMonth = 8,
            lengthInFeet = 0.8f,
            distanceInMiles = 16,
            color = "Brown",
            imageUrl = "https://images.unsplash.com/photo-1587300003388-59208cc962cb?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=MXwxODQ1NjZ8MHwxfHNlYXJjaHwzfHxkb2d8ZW58MHx8fA&ixlib=rb-1.2.1&q=80&w=400"
        ),
        Puppy(
            id = 4,
            name = "Puppy 4",
            nickName = "Bandit",
            gender = Gender.FEMALE,
            ageInMonth = 10,
            lengthInFeet = 0.9f,
            distanceInMiles = 19,
            color = "Black",
            imageUrl = "https://images.unsplash.com/photo-1577447217290-a609cd45101f?ixlib=rb-1.2.1&ixid=MXwxMjA3fDB8MHxleHBsb3JlLWZlZWR8MTh8fHxlbnwwfHx8&auto=format&fit=crop&w=400&q=60"
        ),
        Puppy(
            id = 5,
            name = "Puppy 5",
            nickName = "Baxter",
            gender = Gender.FEMALE,
            ageInMonth = 7,
            lengthInFeet = 0.5f,
            distanceInMiles = 10,
            color = "White",
            imageUrl = "https://images.unsplash.com/photo-1560807707-8cc77767d783?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=MXwxODQ1NjZ8MHwxfHNlYXJjaHw3fHxkb2d8ZW58MHx8fA&ixlib=rb-1.2.1&q=80&w=400"
        ),
        Puppy(
            id = 6,
            name = "Puppy 6",
            nickName = "Bear",
            gender = Gender.MALE,
            ageInMonth = 10,
            lengthInFeet = 0.9f,
            distanceInMiles = 19,
            color = "Brown",
            imageUrl = "https://images.unsplash.com/photo-1583512603805-3cc6b41f3edb?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=MXwxODQ1NjZ8MHwxfHNlYXJjaHw0fHxkb2d8ZW58MHx8fA&ixlib=rb-1.2.1&q=80&w=400"
        ),
        Puppy(
            id = 7,
            name = "Puppy 7",
            nickName = "Beau",
            gender = Gender.FEMALE,
            ageInMonth = 10,
            lengthInFeet = 0.9f,
            distanceInMiles = 19,
            color = "Brown",
            imageUrl = "https://images.unsplash.com/photo-1516371535707-512a1e83bb9a?ixlib=rb-1.2.1&q=80&fm=jpg&crop=entropy&cs=tinysrgb&w=400&fit=max"
        ),
        Puppy(
            id = 8,
            name = "Puppy 8",
            nickName = "Benji",
            gender = Gender.FEMALE,
            ageInMonth = 10,
            lengthInFeet = 0.9f,
            distanceInMiles = 19,
            color = "White",
            imageUrl = "https://images.unsplash.com/photo-1546491764-67a5b8d5b3ae?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=MXwxODQ1NjZ8MHwxfHNlYXJjaHwyMHx8ZG9nfGVufDB8fHw&ixlib=rb-1.2.1&q=80&w=400"
        )
    )

    private var _clickedPuppy: Puppy? = null

    val clickedPuppy get() = _clickedPuppy ?: puppies.first()

    fun onPuppyClicked(puppy: Puppy) {
        this._clickedPuppy = puppy
    }
}
