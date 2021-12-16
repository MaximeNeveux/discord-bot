package audio;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.javacord.api.DiscordApi;
import org.javacord.api.audio.AudioSource;
import org.javacord.api.audio.AudioTransformer;
import org.javacord.api.listener.ObjectAttachableListener;
import org.javacord.api.listener.audio.AudioSourceAttachableListener;
import org.javacord.api.listener.audio.AudioSourceFinishedListener;
import org.javacord.api.util.event.ListenerManager;

public class AudioSourceClass implements AudioSource {

	@Override
	public ListenerManager<AudioSourceFinishedListener> addAudioSourceFinishedListener(
			AudioSourceFinishedListener listener) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AudioSourceFinishedListener> getAudioSourceFinishedListeners() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T extends AudioSourceAttachableListener & ObjectAttachableListener> Collection<ListenerManager<T>> addAudioSourceAttachableListener(
			T listener) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T extends AudioSourceAttachableListener & ObjectAttachableListener> void removeAudioSourceAttachableListener(
			T listener) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <T extends AudioSourceAttachableListener & ObjectAttachableListener> Map<T, List<Class<T>>> getAudioSourceAttachableListeners() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T extends AudioSourceAttachableListener & ObjectAttachableListener> void removeListener(
			Class<T> listenerClass, T listener) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public DiscordApi getApi() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addTransformer(AudioTransformer transformer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean removeTransformer(AudioTransformer transformer) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<AudioTransformer> getTransformers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeTransformers() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public byte[] getNextFrame() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean hasNextFrame() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean hasFinished() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setMuted(boolean muted) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isMuted() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public AudioSource copy() {
		// TODO Auto-generated method stub
		return null;
	}

}
