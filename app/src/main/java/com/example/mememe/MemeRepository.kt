package com.example.mememe

interface MemeRepository {
    suspend fun fetchMeme(): List<Meme>
}