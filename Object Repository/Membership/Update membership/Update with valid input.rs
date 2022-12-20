<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Update with valid input</name>
   <tag></tag>
   <elementGuidId>0b1cdd01-a84b-4c4b-850d-8b4773cffcf5</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <connectionTimeout>0</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n  \&quot;first_name\&quot;: \&quot;QE2\&quot;,\n  \&quot;last_name\&quot;: \&quot;Test\&quot;,\n  \&quot;phone_number\&quot;: \&quot;13223898121\&quot;,\n  \&quot;image\&quot;: \&quot;https://storage.googleapis.com/alterra-capstone.appspot.com/users/profile.png?Expires\u003d1702957993\\u0026GoogleAccessId\u003dfirebase-adminsdk-kae8m%40alterra-capstone.iam.gserviceaccount.com\\u0026Signature\u003dTrK9vq3%2BZ5MgjtLkcz4cEIAcCyzn8ZifCm5s0K9up91Y6cCjcmzTSP4aFyh7gi2AWfh5MAlo4tl33KDqSMVrL%2BRbyHBhjk%2Bshx6u1wysFBAhOskVE3PTigEHodcQfsxF9WUfukQOcynYa3HFmTrSIOOOn9YMgejVlyxoAbNipbaSOmfyyj4a7cmgV79UCgoZ3kwrVsOfaHWWWXyOdU51mCFMKLqi4u5QaCMmVhdrcjShGPnJpSWBsoU26CEA7GE0igtIJlRFZB9L6p0jrKkenAwfH0qAosxdnNsxIyw0xkmsl0OwOlURQZsBbeBX6a%2Baqg4RKY4SqDPJ9EY%2FLlATkg%3D%3D\&quot;,\n  \&quot;image_name\&quot;: \&quot;profile.png\&quot;\n}&quot;,
  &quot;contentType&quot;: &quot;application/json&quot;,
  &quot;charset&quot;: &quot;UTF-8&quot;
}</httpBodyContent>
   <httpBodyType>text</httpBodyType>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <value>application/json</value>
      <webElementGuid>897453a1-f9a1-480a-b8a8-a98da1b1dcad</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Authorization</name>
      <type>Main</type>
      <value>Bearer ${GlobalVariable.GlobalVar}</value>
      <webElementGuid>672f234a-e514-48a9-b91a-a6b72315dc9e</webElementGuid>
   </httpHeaderProperties>
   <katalonVersion>8.3.0</katalonVersion>
   <maxResponseSize>0</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>PATCH</restRequestMethod>
   <restUrl>https://www.go-rest-api.live/api/v1/users</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceEndpoint></soapServiceEndpoint>
   <soapServiceFunction></soapServiceFunction>
   <socketTimeout>0</socketTimeout>
   <useServiceInfoFromWsdl>true</useServiceInfoFromWsdl>
   <verificationScript>import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable

RequestObject request = WSResponseManager.getInstance().getCurrentRequest()

ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
