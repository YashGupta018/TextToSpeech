# TextToSpeech

```
public class TextToSpeech
extends Object

java.lang.Object
   ↳	android.speech.tts.TextToSpeech
   ```

Synthesizes speech from text for immediate playback or to create a sound file.

A TextToSpeech instance can only be used to synthesize text once it has completed its initialization. Implement the 
```TextToSpeech.OnInitListener``` to be notified of the completion of the initialization.
When you are done using the TextToSpeech instance, call the ```shutdown()``` method to release the native resources used by the TextToSpeech engine.
Apps targeting Android 11 that use text-to-speech should declare ```TextToSpeech.Engine.INTENT_ACTION_TTS_SERVICE``` in the ```queries``` elements of their manifest:

```
 <queries>
   ...
  <intent>
      <action android:name="android.intent.action.TTS_SERVICE" />
  </intent>
 </queries>
 ```
