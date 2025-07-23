/**
 * Based on some old Pete code - https://gist.github.com/petebankhead/618fbd7549faeb5a09921d846ecedd34 
 * the goal was to be able to recolor channels in QuPath *without* having to generate or use a list, which most methods seem to require
 * 
 * @author Riley Hannan
 * 
 * todo: build a script which can take a nicely colored multichannel image, 
 * export individual channels as WHITE (alternatively export a high res multichannel viewer image?), 
 * and then restore or otherwise return the image to its original polychromatic state.
 * 
 * maybe using the generating/saving/loading of preset settings seen in the Channels class https://github.com/BIOP/qupath-extension-biop/releases/tag/v1.1.0
 *  
 */


def viewer = getCurrentViewer()
def display = viewer.getImageDisplay()
def channels = display.availableChannels()

for (int i = 0; i < channels.size(); i++) {
    //print available[i].getColor() //debug - this is interesting, spits out some 32-bit value and probably worth figuring out how to decode
    //print channels[i].getName() //debug
    channels[i].setLUTColor(255,255,255)//sets to white
}
