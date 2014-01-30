/*
 * Copyright (c) 2011-2013 GoPivotal, Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package reactor.core.alloc;

/**
 * A {@code Pool} provides access to a pool of objects.
 *
 * @param <T>
 * 		The type of object in the pool
 *
 * @author Jon Brisbin
 * @author Stephane Maldini
 * @since 1.1
 */
@Deprecated
public interface Pool<T> {

	/**
	 * Allocates a new object from the pool.
	 *
	 * @return the allocated object
	 */
	T allocate();

	/**
	 * Returns an object to the pool.
	 *
	 * @param obj
	 * 		The object to deallocate
	 */
	void deallocate(T obj);

}