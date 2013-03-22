# Apache Cordova share Android plugin
By Andreas Daskalopoulos

## Using the plugin

* Add java code to your project's build source

* Register the plugin in the plugins.xml file

```xml
<plugin name="SharePlugin" value="com.phonegap.plugins.share.SharePlugin" />
```

* Call the plugin, specifying subject, text, success function, and failure function

```javascript
window.plugins.share.show(
	'I like turtles', 
	'http://www.mndaily.com', 
	function(){}, 
	function(){});
```


