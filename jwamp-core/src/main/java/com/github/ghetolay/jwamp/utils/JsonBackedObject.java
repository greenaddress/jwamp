/**
 * 
 */
package com.github.ghetolay.jwamp.utils;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;

/**
 * A holder to allow deferred serialization and deserialization of inbound objects being sent to/retrieved from json streams
 * <br>
 * Use {@link JsonBackedObjectFactory} to create JsonBackedObjects
 */
public interface JsonBackedObject {

	public <T> T getAs(Class<T> clazz);
	
	public <T> T getAs(TypeReference<T> typeReference);
	

}
