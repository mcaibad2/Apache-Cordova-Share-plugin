# Apache Cordova share plugin
By Andreas Daskalopoulos

## Using the plugin

### Android

* Add SharePlugin.java to your project's build source

* Register the plugin in the config.xml file

```xml
<plugin name="SharePlugin" value="com.phonegap.plugins.share.SharePlugin" />
```

* Copy script and add script tag 

```javascript
<script type="text/javascript" charset="utf-8" src="share.js"></script>  
```

* Call the plugin, specifying subject, text, success function, and failure function

```javascript
window.plugins.share.show(
	'I like turtles', 
	'http://www.mndaily.com', 
	function(){}, 
	function(){});
```


