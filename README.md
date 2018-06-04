# iso10161

## About

This repository houses the base level runtime codecs for sending and receiving ISO 10161 APDUs. The codecs are built from the
published ASN.1 definitions using A2J (https://github.com/k-int/A2J). A2J also provides a number of utilities for creating
clients and servers which communicate using these CODECS. See src/test/groovy/com/k_int/iso10161/ProtocolEndpointTest.groovy for
example tests which exercise both interfaces.

This component is intended to be a raw low level tool for anyone wanting to build an ISO-ILL protocol stack from the base APDUs up.
Developers looking to build ILL Systems using higher level tools (IE, Json objects passed via RabbitMQ queues and topics and capable
of being rolled into docker style service images) should see the resource-sharing-message-services project at
https://github.com/k-int/resource-sharing-message-services

## For developers

The ASN.1 was compiled and added to the source tree with the following gradle command.

gradle -DCodecBasePackage=com.k_int.iso10161 compileASN

# Release Process

Update build.gradle with appropriate versions
gradle build
gradle install (Install in local jar cache)
gradle uploadArchives  (Deploy to k-int nexus)
