package com.apirest.webfluxtutorial.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apirest.webfluxtutorial.document.Playlist;
import com.apirest.webfluxtutorial.repository.PlaylistRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class PlaylistServiceImpl implements PlaylistService	{
	
	@Autowired
	PlaylistRepository playlistRepository;
	
	@Override
	public Flux<Playlist> findAll() {
		return playlistRepository.findAll();
	}

	@Override
	public Mono<Playlist> findByID(String id) {
		return playlistRepository.findById(id);
	}

	@Override
	public Mono<Playlist> save(Playlist playlist) {
		return playlistRepository.save(playlist);
	}

}
