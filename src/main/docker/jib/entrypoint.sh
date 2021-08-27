#!/bin/sh

echo "The application will start in ${FLEAT_SLEEP}s..." && sleep ${FLEAT_SLEEP}
exec java ${JAVA_OPTS} -noverify -XX:+AlwaysPreTouch -Djava.security.egd=file:/dev/./urandom -cp /app/resources/:/app/classes/:/app/libs/* "com.fleta.customersservice.CustomersServiceApp"  "$@"
