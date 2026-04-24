package com.cherepanov.diplom.noise;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class ImpulseNoiseGenerator implements NoiseGenerator {

    Logger LOG = LoggerFactory.getLogger(ImpulseNoiseGenerator.class);

    private Random random;
    private ImageImpl image;
    int[][] noisedImagePixels;

    @Autowired
    public ImpulseNoiseGenerator(Random random, ImageImpl image) {
        this.random = random;
        this.image = image;
    }
}
