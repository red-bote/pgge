/*
 * Copyright (c) 2021 Glenn Neidermeier
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.mygdx.game.screens;

import com.badlogic.gdx.controllers.Controller;
import com.badlogic.gdx.controllers.ControllerListener;

public class ControllerListenerAdapter implements ControllerListener {

    @Override
    public void connected(Controller controller) { // mt
    }

    @Override
    public void disconnected(Controller controller) { // mt
    }

    @Override
    public boolean buttonDown(Controller controller, int buttonIndex) {
        return false;
    }

    @Override
    public boolean buttonUp(Controller controller, int buttonIndex) {
        return false;
    }

    @Override
    public boolean axisMoved(Controller controller, int axisIndex, float value) {
        return false;
    }
}
