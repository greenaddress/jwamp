//
//  ========================================================================
//  Copyright (c) 1995-2014 Mort Bay Consulting Pty. Ltd.
//  ------------------------------------------------------------------------
//  All rights reserved. This program and the accompanying materials
//  are made available under the terms of the Eclipse Public License v1.0
//  and Apache License v2.0 which accompanies this distribution.
//
//      The Eclipse Public License is available at
//      http://www.eclipse.org/legal/epl-v10.html
//
//      The Apache License v2.0 is available at
//      http://www.opensource.org/licenses/apache2.0.php
//
//  You may elect to redistribute this code under either of these licenses.
//  ========================================================================
//

package org.eclipse.jetty.util.thread;

/* ------------------------------------------------------------ */
/** ThreadPool.
 * 
 *
 */
public interface ThreadPool
{
    /* ------------------------------------------------------------ */
    public abstract boolean dispatch(Runnable job);

    /* ------------------------------------------------------------ */
    /**
     * @return The total number of threads currently in the pool
     */
    public int getThreads();

    /* ------------------------------------------------------------ */
    /**
     * @return The number of idle threads in the pool
     */
    public int getIdleThreads();

    /* ------------------------------------------------------------ */
    /* ------------------------------------------------------------ */
    public interface SizedThreadPool extends ThreadPool
    {
        public int getMinThreads();
        public int getMaxThreads();
    }
}
