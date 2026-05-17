import pytest

from Exercise6 import get_crypto_data

def test_get_crypto_data_math():
    df = get_crypto_data()
    assert df.shape == (7, 3)
    assert df['Bitcoin'].iloc[0] == 40000
    assert df['Bitcoin'].iloc[-1] == 48000
    assert df['Bitcoin'].max() == 48000
    assert df['Ethereum'].min() == 2500
    bitcoin_growth = df['Bitcoin'].iloc[-1] - df['Bitcoin'].iloc[0]
    assert bitcoin_growth == 8000
