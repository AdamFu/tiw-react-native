
# react-native-tiw-react-native

## Getting started

`$ npm install react-native-tiw-react-native --save`

### Mostly automatic installation

`$ react-native link react-native-tiw-react-native`

### Manual installation


#### iOS

1. In XCode, in the project navigator, right click `Libraries` ➜ `Add Files to [your project's name]`
2. Go to `node_modules` ➜ `react-native-tiw-react-native` and add `RNTiwReactNative.xcodeproj`
3. In XCode, in the project navigator, select your project. Add `libRNTiwReactNative.a` to your project's `Build Phases` ➜ `Link Binary With Libraries`
4. Run your project (`Cmd+R`)<

#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`
  - Add `import com.tencent.tiw.react.RNTiwReactNativePackage;` to the imports at the top of the file
  - Add `new RNTiwReactNativePackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-tiw-react-native'
  	project(':react-native-tiw-react-native').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-tiw-react-native/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-tiw-react-native')
  	```
## Usage
```javascript
import RNTiwReactNative from 'react-native-tiw-react-native';

// TODO: What to do with the module?
RNTiwReactNative;
```
  