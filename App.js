/**
 * Sample React Native App
 * https://github.com/facebook/react-native
 *
 * @format
 * @flow strict-local
 */

import React from 'react';
import {StyleSheet} from 'react-native';
import Video from 'react-native-video';

const App = () => {
  return (
    <Video
      source={{
        uri: 'http://techslides.com/demos/sample-videos/small.mp4',
      }}
      resizeMode="contain"
      style={styles.backgroundVideo}
    />
  );
};
var styles = StyleSheet.create({
  backgroundVideo: {
    width: '100%',
    height: '100%',
  },
});

export default App;
