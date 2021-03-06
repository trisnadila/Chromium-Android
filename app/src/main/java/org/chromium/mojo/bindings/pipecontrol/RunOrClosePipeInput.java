
// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     mojo/public/interfaces/bindings/pipe_control_messages.mojom
//

package org.chromium.mojo.bindings.pipecontrol;

import org.chromium.mojo.bindings.DeserializationException;


public final class RunOrClosePipeInput extends org.chromium.mojo.bindings.Union {

    public static final class Tag {
        public static final int PeerAssociatedEndpointClosedEvent = 0;
    };
    private PeerAssociatedEndpointClosedEvent mPeerAssociatedEndpointClosedEvent;

    public void setPeerAssociatedEndpointClosedEvent(PeerAssociatedEndpointClosedEvent peerAssociatedEndpointClosedEvent) {
        this.mTag = Tag.PeerAssociatedEndpointClosedEvent;
        this.mPeerAssociatedEndpointClosedEvent = peerAssociatedEndpointClosedEvent;
    }

    public PeerAssociatedEndpointClosedEvent getPeerAssociatedEndpointClosedEvent() {
        assert this.mTag == Tag.PeerAssociatedEndpointClosedEvent;
        return this.mPeerAssociatedEndpointClosedEvent;
    }


    @Override
    protected final void encode(org.chromium.mojo.bindings.Encoder encoder0, int offset) {
        encoder0.encode(org.chromium.mojo.bindings.BindingsHelper.UNION_SIZE, offset);
        encoder0.encode(this.mTag, offset + 4);
        switch (mTag) {
            case Tag.PeerAssociatedEndpointClosedEvent: {
                
                encoder0.encode(this.mPeerAssociatedEndpointClosedEvent, offset + 8, false);
                break;
            }
            default: {
                break;
            }
        }
    }

    public static RunOrClosePipeInput deserialize(org.chromium.mojo.bindings.Message message) {
        return decode(new org.chromium.mojo.bindings.Decoder(message).decoderForSerializedUnion(), 0);
    }

    public static final RunOrClosePipeInput decode(org.chromium.mojo.bindings.Decoder decoder0, int offset) {
        org.chromium.mojo.bindings.DataHeader dataHeader = decoder0.readDataHeaderForUnion(offset);
        if (dataHeader.size == 0) {
            return null;
        }
        RunOrClosePipeInput result = new RunOrClosePipeInput();
        switch (dataHeader.elementsOrVersion) {
            case Tag.PeerAssociatedEndpointClosedEvent: {
                
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(offset + org.chromium.mojo.bindings.DataHeader.HEADER_SIZE, false);
                result.mPeerAssociatedEndpointClosedEvent = PeerAssociatedEndpointClosedEvent.decode(decoder1);
                result.mTag = Tag.PeerAssociatedEndpointClosedEvent;
                break;
            }
            default: {
                break;
            }
        }
        return result;
    }
}