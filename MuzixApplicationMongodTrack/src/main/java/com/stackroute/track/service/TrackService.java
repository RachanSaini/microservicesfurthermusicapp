package com.stackroute.track.service;

import com.stackroute.track.domain.Track;
import com.stackroute.track.exceptions.NullValuesPassed;
import com.stackroute.track.exceptions.TrackAlreadyExists;
import com.stackroute.track.exceptions.TrackDoesNotExists;


import java.util.List;

public interface TrackService {

    public Track saveTrack(Track track) throws TrackAlreadyExists, NullValuesPassed;

    public List<Track> getAllTracks();

    public Track getTrackById(int trackId) throws TrackDoesNotExists;

    public Track updateTrack(Track track) throws TrackDoesNotExists;

    public Track deleteTrack(int id)throws TrackDoesNotExists;
}

