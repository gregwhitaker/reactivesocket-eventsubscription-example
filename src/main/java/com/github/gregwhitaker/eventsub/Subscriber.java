/*
 * Copyright 2016 Greg Whitaker
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.github.gregwhitaker.eventsub;

import java.net.InetSocketAddress;

public class Subscriber {
    private final String name;
    private final InetSocketAddress remoteAddress;

    public static void main(String... args) {
        Subscriber subscriber = new Subscriber(args[0], new InetSocketAddress("localhost", 8080));
        subscriber.start();
    }

    public Subscriber(String name, InetSocketAddress remoteAddress) {
        this.name = name;
        this.remoteAddress = remoteAddress;
    }

    public void start() {

    }
}
